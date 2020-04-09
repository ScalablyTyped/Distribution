organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-5a848f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-50dc83",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-f7b0bf",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-d588a3",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-c229a6",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
