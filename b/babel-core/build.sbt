organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-7eba8c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-b71d20",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-5fefcb",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-c08bce",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-441850",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-5f14cf",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
