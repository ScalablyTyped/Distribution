organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20190119Z-ef2276"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-0d497d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-4efb44",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-636d85",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-774a25",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-455d3a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-f97a6c",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-57d54e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-af8e6b",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-3fe8e9",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        