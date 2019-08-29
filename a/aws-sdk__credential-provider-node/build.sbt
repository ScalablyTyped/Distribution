organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-1f3106"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-e3bde2",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-3b01ea",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-db6a20",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-cf8aa2",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        