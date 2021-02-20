package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAliasOutput extends StObject {
  
  /**
    * The requested alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.gameliftMod.Alias] = js.native
}
object DescribeAliasOutput {
  
  @scala.inline
  def apply(): DescribeAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAliasOutput]
  }
  
  @scala.inline
  implicit class DescribeAliasOutputMutableBuilder[Self <: DescribeAliasOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
