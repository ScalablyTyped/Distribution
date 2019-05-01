organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20190228Z-e124da"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20190228Z-3db778",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20190228Z-7f580a",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        