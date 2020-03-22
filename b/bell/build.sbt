organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20190119Z-23fb52"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-efa725",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-f30551",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200128Z-8a03ea",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-7e0c86",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-0b3433",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-574028",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-327e15",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-4a23e4",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-ad5671",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
