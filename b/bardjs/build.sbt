organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20190322Z-abcea5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-3c1531",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-780194",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190212Z-799977",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        