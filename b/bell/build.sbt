organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20190119Z-a2abc7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-937b6e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2a99dd",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-5f382c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-6dd6f5",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-daf975",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-329130",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-09fe84",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f556a7",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        