package typings.sucraseTbLAtQ5t

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClassInfoDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/util/getClassInfo.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
    tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
    nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default,
    disableESTransforms: Boolean
  ): ClassInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rootTransformer.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], nameManager.asInstanceOf[js.Any], disableESTransforms.asInstanceOf[js.Any])).asInstanceOf[ClassInfo]
  
  trait ClassHeaderInfo extends StObject {
    
    var className: String | Null
    
    var hasSuperclass: Boolean
    
    var isExpression: Boolean
  }
  object ClassHeaderInfo {
    
    inline def apply(hasSuperclass: Boolean, isExpression: Boolean): ClassHeaderInfo = {
      val __obj = js.Dynamic.literal(hasSuperclass = hasSuperclass.asInstanceOf[js.Any], isExpression = isExpression.asInstanceOf[js.Any], className = null)
      __obj.asInstanceOf[ClassHeaderInfo]
    }
    
    extension [Self <: ClassHeaderInfo](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setHasSuperclass(value: Boolean): Self = StObject.set(x, "hasSuperclass", value.asInstanceOf[js.Any])
      
      inline def setIsExpression(value: Boolean): Self = StObject.set(x, "isExpression", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassInfo extends StObject {
    
    var constructorInitializerStatements: js.Array[String]
    
    var constructorInsertPos: Double | Null
    
    var fields: js.Array[FieldInfo]
    
    var headerInfo: ClassHeaderInfo
    
    var instanceInitializerNames: js.Array[String]
    
    var rangesToRemove: js.Array[TokenRange]
    
    var staticInitializerNames: js.Array[String]
  }
  object ClassInfo {
    
    inline def apply(
      constructorInitializerStatements: js.Array[String],
      fields: js.Array[FieldInfo],
      headerInfo: ClassHeaderInfo,
      instanceInitializerNames: js.Array[String],
      rangesToRemove: js.Array[TokenRange],
      staticInitializerNames: js.Array[String]
    ): ClassInfo = {
      val __obj = js.Dynamic.literal(constructorInitializerStatements = constructorInitializerStatements.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], headerInfo = headerInfo.asInstanceOf[js.Any], instanceInitializerNames = instanceInitializerNames.asInstanceOf[js.Any], rangesToRemove = rangesToRemove.asInstanceOf[js.Any], staticInitializerNames = staticInitializerNames.asInstanceOf[js.Any], constructorInsertPos = null)
      __obj.asInstanceOf[ClassInfo]
    }
    
    extension [Self <: ClassInfo](x: Self) {
      
      inline def setConstructorInitializerStatements(value: js.Array[String]): Self = StObject.set(x, "constructorInitializerStatements", value.asInstanceOf[js.Any])
      
      inline def setConstructorInitializerStatementsVarargs(value: String*): Self = StObject.set(x, "constructorInitializerStatements", js.Array(value*))
      
      inline def setConstructorInsertPos(value: Double): Self = StObject.set(x, "constructorInsertPos", value.asInstanceOf[js.Any])
      
      inline def setConstructorInsertPosNull: Self = StObject.set(x, "constructorInsertPos", null)
      
      inline def setFields(value: js.Array[FieldInfo]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: FieldInfo*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setHeaderInfo(value: ClassHeaderInfo): Self = StObject.set(x, "headerInfo", value.asInstanceOf[js.Any])
      
      inline def setInstanceInitializerNames(value: js.Array[String]): Self = StObject.set(x, "instanceInitializerNames", value.asInstanceOf[js.Any])
      
      inline def setInstanceInitializerNamesVarargs(value: String*): Self = StObject.set(x, "instanceInitializerNames", js.Array(value*))
      
      inline def setRangesToRemove(value: js.Array[TokenRange]): Self = StObject.set(x, "rangesToRemove", value.asInstanceOf[js.Any])
      
      inline def setRangesToRemoveVarargs(value: TokenRange*): Self = StObject.set(x, "rangesToRemove", js.Array(value*))
      
      inline def setStaticInitializerNames(value: js.Array[String]): Self = StObject.set(x, "staticInitializerNames", value.asInstanceOf[js.Any])
      
      inline def setStaticInitializerNamesVarargs(value: String*): Self = StObject.set(x, "staticInitializerNames", js.Array(value*))
    }
  }
  
  trait FieldInfo
    extends StObject
       with TokenRange {
    
    var equalsIndex: Double
    
    var initializerName: String
  }
  object FieldInfo {
    
    inline def apply(end: Double, equalsIndex: Double, initializerName: String, start: Double): FieldInfo = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], equalsIndex = equalsIndex.asInstanceOf[js.Any], initializerName = initializerName.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInfo]
    }
    
    extension [Self <: FieldInfo](x: Self) {
      
      inline def setEqualsIndex(value: Double): Self = StObject.set(x, "equalsIndex", value.asInstanceOf[js.Any])
      
      inline def setInitializerName(value: String): Self = StObject.set(x, "initializerName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenRange extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object TokenRange {
    
    inline def apply(end: Double, start: Double): TokenRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenRange]
    }
    
    extension [Self <: TokenRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
