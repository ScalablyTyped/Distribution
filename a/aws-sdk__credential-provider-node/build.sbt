organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-41b5ae"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-3e376d",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-39c142",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-001255",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-59e680",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        