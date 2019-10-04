organization := "org.scalablytyped"
name := "csp-html-webpack-plugin"
version := "3.0-dt-20190926Z-e2db86"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a7db04",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-73e1b4",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-5b5a96",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-c0dc5d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-c9bb1c",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-afc896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bb5048",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-230399",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e01dc2",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190928Z-63e7f1",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-81002d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        