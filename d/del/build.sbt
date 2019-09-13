organization := "org.scalablytyped"
name := "del"
version := "5.1.0-ad6706"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-1e2984",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-895b24",
  "org.scalablytyped" %%% "globby" % "10.0.1-c08fec",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c93eb3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-b87dcd",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-448965",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-80b036",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        