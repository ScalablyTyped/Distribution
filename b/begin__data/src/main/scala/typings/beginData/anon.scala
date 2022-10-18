package typings.beginData

import org.scalablytyped.runtime.StringDictionary
import typings.beginData.mod.BeginDataType
import typings.beginData.mod.ReadonlyBeginDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictothers
    extends StObject
       with /* others */ StringDictionary[js.UndefOr[BeginDataType]] {
    
    var key: String
    
    var table: String
  }
  object Dictothers {
    
    inline def apply(key: String, table: String): Dictothers = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictothers]
    }
    
    extension [Self <: Dictothers](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key
    extends StObject
       with /* others */ StringDictionary[js.UndefOr[Any]] {
    
    var key: String
    
    var table: String
  }
  object Key {
    
    inline def apply(key: String, table: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait Table
    extends StObject
       with /* others */ StringDictionary[js.UndefOr[ReadonlyBeginDataType]] {
    
    var key: String
    
    var table: String
  }
  object Table {
    
    inline def apply(key: String, table: String): Table = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Table]
    }
    
    extension [Self <: Table](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
}
