organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20181121Z-cae919"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-678fe2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-9fafc7",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181214Z-db04f6",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-1fc1dc",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181213Z-9b3760",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-90fc20",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-66eb34",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-7ccab7",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-878ba9",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        