organization := "org.scalablytyped"
name := "aws-sdk__signature-v4-browser"
version := "0.1.0-preview.2-695eea"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__signature-v4" % "3.193.0-8cc493",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.193.0-dc0323",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
