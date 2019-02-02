organization := "org.scalablytyped"
name := "builder-util"
version := "9.6.2-9114ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-3f59da",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-21090e",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.3-838f48",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-053f79",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.1-a91ce0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-8e87c7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-98c322",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-585a5f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-4a413b",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-0ebd09",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6e1cbe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-fdcda0",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-0f4428",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-14e472",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-efeb04",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-408efe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        