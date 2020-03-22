organization := "org.scalablytyped"
name := "del"
version := "5.1.0-923e8f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-f9a303",
  "org.scalablytyped" %%% "globby" % "11.0.0-8fc3ca",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-0c9f4b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-50d79d",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-7563ce",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
