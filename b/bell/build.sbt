organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20200515Z-88851c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200515Z-272018",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-7954d0",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200721Z-d6eba7",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-465532",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-11c1c9",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-c79aa7",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200515Z-610482",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200515Z-cf3f54",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-1079de",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
