organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-cognito-identity"
version := "0.1.0-preview.2-0b0be5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity-browser" % "0.1.0-preview.2-972640",
  "org.scalablytyped" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-e3994e",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-968c36",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
