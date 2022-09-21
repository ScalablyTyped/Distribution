package typings.tslintXANLscI2

import typings.std.Partial
import typings.std.Set
import typings.tslintXANLscI2.completedDocsRuleDTsMod.Visibility
import typings.tslintXANLscI2.exclusionDTsMod.Exclusion
import typings.tslintXANLscI2.exclusionDescriptorsDTsMod.ExclusionDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockExclusionDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/completed-docs/blockExclusion.d.ts", "BlockExclusion")
  @js.native
  open class BlockExclusion () extends Exclusion[IBlockExclusionDescriptor] {
    def this(descriptor: Partial[IBlockExclusionDescriptor]) = this()
    
    val visibilities: Set[Visibility] = js.native
  }
  
  trait IBlockExclusionDescriptor
    extends StObject
       with ExclusionDescriptor {
    
    var visibilities: js.UndefOr[js.Array[Visibility]] = js.undefined
  }
  object IBlockExclusionDescriptor {
    
    inline def apply(): IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBlockExclusionDescriptor]
    }
    
    extension [Self <: IBlockExclusionDescriptor](x: Self) {
      
      inline def setVisibilities(value: js.Array[Visibility]): Self = StObject.set(x, "visibilities", value.asInstanceOf[js.Any])
      
      inline def setVisibilitiesUndefined: Self = StObject.set(x, "visibilities", js.undefined)
      
      inline def setVisibilitiesVarargs(value: Visibility*): Self = StObject.set(x, "visibilities", js.Array(value*))
    }
  }
}
