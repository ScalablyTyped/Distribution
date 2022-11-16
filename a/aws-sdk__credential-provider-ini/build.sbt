organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-ini"
version := "3.211.0-8becbc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.208.0-e6364a",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.209.0-adb61e",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.208.0-b45120",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
