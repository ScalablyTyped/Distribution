package typings.colornames.mod

import typings.colornames.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the functionality to resolve any kind of color by its name.
  */
@js.native
trait GlobalResolver extends js.Object {
  
  /**
    * Gets the color with the specified name.
    */
  def apply(name: String): js.UndefOr[String] = js.native
  
  /**
    * Gets all available colors.
    */
  def all(): js.Array[Color] = js.native
  
  /**
    * Gets the color with the specified name.
    *
    * @param name
    * The name of the color to get.
    */
  /**
    * Provides the functionality to query colors.
    */
  def get(name: String): Color = js.native
  /**
    * Provides the functionality to query colors.
    */
  @JSName("get")
  var get_Original: Call = js.native
}
