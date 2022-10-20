organization := "org.scalablytyped"
name := "aws-sdk__signature-v4-crt"
version := "3.190.0-15c66b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-crt" % "1.14.5-d7aa2a",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.190.0-7ce92c",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.190.0-49d0ee",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
