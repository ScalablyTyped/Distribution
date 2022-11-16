organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.33-dt-20220926Z-c6cd87"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "applepayjs" % "3.0-dt-20220301Z-7bf019",
  "org.scalablytyped" %%% "braintree-web" % "3.75-dt-20220916Z-742885",
  "org.scalablytyped" %%% "googlepay" % "0.6-dt-20220624Z-952a0c",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20221108Z-acb704",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
