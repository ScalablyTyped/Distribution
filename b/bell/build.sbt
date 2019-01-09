organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20181121Z-0ceb31"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-81bdfb",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-5f4ff6",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-62949f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-8bacc5",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-90d510",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-d60f14",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-d57943",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-495653",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-836fbb",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        