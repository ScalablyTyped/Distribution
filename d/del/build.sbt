organization := "org.scalablytyped"
name := "del"
version := "5.0.0-063ed6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-7e3e96",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-26312c",
  "org.scalablytyped" %%% "globby" % "10.0.1-81c679",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-a3f25b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-de7aae",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-430b55",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        