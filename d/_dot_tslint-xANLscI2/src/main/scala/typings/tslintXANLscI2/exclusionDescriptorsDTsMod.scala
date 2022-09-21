package typings.tslintXANLscI2

import org.scalablytyped.runtime.StringDictionary
import typings.tslintXANLscI2.completedDocsRuleDTsMod.DocType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exclusionDescriptorsDTsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslintXANLscI2.blockExclusionDTsMod.IBlockExclusionDescriptor
    - typings.tslintXANLscI2.classExclusionDTsMod.IClassExclusionDescriptor
    - typings.tslintXANLscI2.tagExclusionDTsMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends StObject
  object ExclusionDescriptor {
    
    inline def IBlockExclusionDescriptor(): typings.tslintXANLscI2.blockExclusionDTsMod.IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslintXANLscI2.blockExclusionDTsMod.IBlockExclusionDescriptor]
    }
    
    inline def IClassExclusionDescriptor(): typings.tslintXANLscI2.classExclusionDTsMod.IClassExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslintXANLscI2.classExclusionDTsMod.IClassExclusionDescriptor]
    }
    
    inline def ITagExclusionDescriptor(): typings.tslintXANLscI2.tagExclusionDTsMod.ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tslintXANLscI2.tagExclusionDTsMod.ITagExclusionDescriptor]
    }
  }
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}
