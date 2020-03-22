organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-fc62c7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-44e760",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-e7754d",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-312c53",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
