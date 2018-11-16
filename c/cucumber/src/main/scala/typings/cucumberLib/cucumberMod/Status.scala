package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSImport("cucumber", "Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait AMBIGUOUS
    extends cucumberLib.cucumberMod.Status
  
  @js.native
  sealed trait FAILED
    extends cucumberLib.cucumberMod.Status
  
  @js.native
  sealed trait PASSED
    extends cucumberLib.cucumberMod.Status
  
  @js.native
  sealed trait PENDING
    extends cucumberLib.cucumberMod.Status
  
  @js.native
  sealed trait SKIPPED
    extends cucumberLib.cucumberMod.Status
  
  @js.native
  sealed trait UNDEFINED
    extends cucumberLib.cucumberMod.Status
  
  /* "ambiguous" */ val AMBIGUOUS: AMBIGUOUS with java.lang.String = js.native
  /* "failed" */ val FAILED: FAILED with java.lang.String = js.native
  /* "passed" */ val PASSED: PASSED with java.lang.String = js.native
  /* "pending" */ val PENDING: PENDING with java.lang.String = js.native
  /* "skipped" */ val SKIPPED: SKIPPED with java.lang.String = js.native
  /* "undefined" */ val UNDEFINED: UNDEFINED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cucumberLib.cucumberMod.Status with java.lang.String] = js.native
}

