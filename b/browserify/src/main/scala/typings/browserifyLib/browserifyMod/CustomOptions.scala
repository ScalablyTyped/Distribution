package typings
package browserifyLib.browserifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Core options pertaining to a Browserify instance, extended by user options
  */
trait CustomOptions
  extends /**
  * Custom properties can be defined on Options.
  * These options are forwarded along to module-deps and browser-pack directly.
  */
/* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** the directory that Browserify starts bundling from for filenames that start with .. */
  var basedir: js.UndefOr[java.lang.String] = js.undefined
}

object CustomOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Custom properties can be defined on Options.
    * These options are forwarded along to module-deps and browser-pack directly.
    */
  /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    basedir: java.lang.String = null
  ): CustomOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    __obj.asInstanceOf[CustomOptions]
  }
}

