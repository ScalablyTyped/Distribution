package typings.ddTrace

import typings.ddTrace.ddTraceNumbers.`-1`
import typings.ddTrace.ddTraceNumbers.`0`
import typings.ddTrace.ddTraceNumbers.`1`
import typings.ddTrace.ddTraceNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityMod {
  
  @JSImport("dd-trace/ext/priority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/priority", "AUTO_KEEP")
  @js.native
  def AUTO_KEEP: `1` = js.native
  @scala.inline
  def AUTO_KEEP_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_KEEP")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/priority", "AUTO_REJECT")
  @js.native
  def AUTO_REJECT: `0` = js.native
  @scala.inline
  def AUTO_REJECT_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_REJECT")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/priority", "USER_KEEP")
  @js.native
  def USER_KEEP: `2` = js.native
  @scala.inline
  def USER_KEEP_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_KEEP")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/priority", "USER_REJECT")
  @js.native
  def USER_REJECT: `-1` = js.native
  @scala.inline
  def USER_REJECT_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_REJECT")(x.asInstanceOf[js.Any])
}
