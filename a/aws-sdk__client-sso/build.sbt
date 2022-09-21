organization := "org.scalablytyped"
name := "aws-sdk__client-sso"
version := "3.171.0-21cefb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-sdk__fetch-http-handler" % "3.171.0-c4ab38",
  "org.scalablytyped" %%% "aws-sdk__node-http-handler" % "3.171.0-898dff",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "3.171.0-bf54b1",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "3.171.0-c9c875",
  "org.scalablytyped" %%% "aws-sdk__types" % "3.171.0-8212c5",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
