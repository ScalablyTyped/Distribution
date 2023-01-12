package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Self
import typings.consumerDataStandards.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRecipientsStatusList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Response data for the query
    */
  var data: js.Array[Status]
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object DataRecipientsStatusList {
  
  inline def apply(data: js.Array[Status], links: Self, meta: StringDictionary[Any]): DataRecipientsStatusList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecipientsStatusList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRecipientsStatusList] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Status]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Status*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
