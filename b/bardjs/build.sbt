organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20190808Z-383c8c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20191126Z-af02cb",
  "org.scalablytyped" %%% "chai" % "4.2-dt-20191112Z-3c49a1",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190530Z-53cd87",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        