organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-ini"
version := "3.204.0-5b935f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-web-identity" % "3.201.0-7fc635",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "3.201.0-79f6f4",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.201.0-360262",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
