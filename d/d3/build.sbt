organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190819Z-77bb18"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-a4966a",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-ec602d",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-fdbfab",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-95c5af",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-88c96c",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-cf3431",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-1f3e61",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-6bba57",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-1200b1",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-57d2cd",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-05ffa1",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-dd4dba",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-66cc9e",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-ce741d",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-fd1ac0",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-bf8c17",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-816de5",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-df9493",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-5cac90",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-bfca76",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-03e63d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-44c666",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-c2de6c",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-8aaeb3",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-7aee04",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-8f8294",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-5835ef",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-5775cc",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-718f2b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        