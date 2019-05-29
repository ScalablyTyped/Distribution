organization := "org.scalablytyped"
name := "copy-webpack-plugin"
version := "5.0-dt-20190426Z-4e7447"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c668e9",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-6de98a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4c9904",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c234c0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-db399f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-c79d12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        