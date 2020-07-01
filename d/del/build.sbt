organization := "org.scalablytyped"
name := "del"
version := "5.1.0-c9040f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-9eb00d",
  "org.scalablytyped" %%% "globby" % "11.0.1-00b9cd",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-a33080",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-13df6b",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-45e2e8",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
