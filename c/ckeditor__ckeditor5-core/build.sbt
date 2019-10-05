organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20190228Z-5813b1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20190228Z-194de7",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20190228Z-b6a0b6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        