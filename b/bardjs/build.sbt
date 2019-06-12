organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20190322Z-98fee3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-43c701",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-ddce5c",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190530Z-57ff38",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        