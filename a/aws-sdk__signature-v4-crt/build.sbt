organization := "org.scalablytyped"
name := "aws-sdk__signature-v4-crt"
version := "3.193.0-3bbe24"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-crt" % "1.14.5-387117",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.193.0-a1955c",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-e6a0eb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
