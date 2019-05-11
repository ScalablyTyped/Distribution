organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-4a4a3c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-382142",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-d76b33",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-caf51e",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-15c91e",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-af3f7e",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-680622",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        