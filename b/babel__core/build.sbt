organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20190515Z-15d073"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20190213Z-859da3",
  "org.scalablytyped" %%% "babel__parser" % "7.5.5-a05bd7",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-3f1b8f",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20190611Z-1892cb",
  "org.scalablytyped" %%% "babel__types" % "7.5.5-bbad9b",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        