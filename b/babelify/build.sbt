organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20200225Z-0da219"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-c580f8",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200226Z-b71d20",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-644ddd",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-c08bce",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-441850",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-5f14cf",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
