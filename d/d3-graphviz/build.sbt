organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20200103Z-4f1f9b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-cf3431",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-bf8c17",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-03e63d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-8f8294",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-5775cc",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        