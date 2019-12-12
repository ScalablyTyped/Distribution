organization := "org.scalablytyped"
name := "aws-sdk__client-cognito-identity-browser"
version := "0.1.0-preview.2-1a254c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-5c447b",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-59e680",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        