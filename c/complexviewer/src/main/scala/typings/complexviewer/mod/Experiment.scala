package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Experiment extends StObject {
  
  var detmethod: Detmethod
  
  var figures: js.Array[String]
  
  var host: Host
  
  var pubid: js.Array[Identifier]
  
  var sourceDatabase: SourceDatabase
}
object Experiment {
  
  inline def apply(
    detmethod: Detmethod,
    figures: js.Array[String],
    host: Host,
    pubid: js.Array[Identifier],
    sourceDatabase: SourceDatabase
  ): Experiment = {
    val __obj = js.Dynamic.literal(detmethod = detmethod.asInstanceOf[js.Any], figures = figures.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], pubid = pubid.asInstanceOf[js.Any], sourceDatabase = sourceDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experiment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Experiment] (val x: Self) extends AnyVal {
    
    inline def setDetmethod(value: Detmethod): Self = StObject.set(x, "detmethod", value.asInstanceOf[js.Any])
    
    inline def setFigures(value: js.Array[String]): Self = StObject.set(x, "figures", value.asInstanceOf[js.Any])
    
    inline def setFiguresVarargs(value: String*): Self = StObject.set(x, "figures", js.Array(value*))
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPubid(value: js.Array[Identifier]): Self = StObject.set(x, "pubid", value.asInstanceOf[js.Any])
    
    inline def setPubidVarargs(value: Identifier*): Self = StObject.set(x, "pubid", js.Array(value*))
    
    inline def setSourceDatabase(value: SourceDatabase): Self = StObject.set(x, "sourceDatabase", value.asInstanceOf[js.Any])
  }
}
