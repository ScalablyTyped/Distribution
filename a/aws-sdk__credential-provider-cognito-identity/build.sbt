organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-cognito-identity"
version := "0.1.0-preview.2-e3c2f7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity-browser" % "0.1.0-preview.2-0cdb1a",
  "org.scalablytyped" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-ddfd62",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-7dd7f4",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
