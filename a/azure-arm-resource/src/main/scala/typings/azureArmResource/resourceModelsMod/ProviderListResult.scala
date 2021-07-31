package typings.azureArmResource.resourceModelsMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderListResult
  extends StObject
     with Array[Provider] {
  
  /**
    * The URL to use for getting the next set of results.
    */
  val nextLink: js.UndefOr[String] = js.native
}
