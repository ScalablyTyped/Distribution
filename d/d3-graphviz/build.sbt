organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-86904b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-4bd662",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-69dc3a",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-ea2f50",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-04b38b",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-6db0fb",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        