organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20190119Z-55299b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-62c842",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b66195",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-b1b215",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c9663f",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-332cbb",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a40537",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c70aeb",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-2f0000",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-edf05d",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        