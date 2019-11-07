organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-8b8ce5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-b60124",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-188f34",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-9db9f1",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-d8076b",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-3e31b8",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        