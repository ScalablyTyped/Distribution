package typings.ckeditorCkeditor5Watchdog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TEditor /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any */] extends StObject {
    
    def create(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): js.Promise[TEditor]
  }
  object `0` {
    
    inline def apply[TEditor /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any */](create: Any => js.Promise[TEditor]): `0`[TEditor] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[`0`[TEditor]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], TEditor /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any */] (val x: Self & `0`[TEditor]) extends AnyVal {
      
      inline def setCreate(value: Any => js.Promise[TEditor]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  trait Colno extends StObject {
    
    var colno: js.UndefOr[Double] = js.undefined
    
    var date: Double
    
    var filename: js.UndefOr[String] = js.undefined
    
    var lineno: js.UndefOr[Double] = js.undefined
    
    var message: String
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object Colno {
    
    inline def apply(date: Double, message: String): Colno = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colno]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colno] (val x: Self) extends AnyVal {
      
      inline def setColno(value: Double): Self = StObject.set(x, "colno", value.asInstanceOf[js.Any])
      
      inline def setColnoUndefined: Self = StObject.set(x, "colno", js.undefined)
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
      
      inline def setLinenoUndefined: Self = StObject.set(x, "lineno", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait Create[TContext /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any */] extends StObject {
    
    def create(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): js.Promise[TContext]
  }
  object Create {
    
    inline def apply[TContext /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any */](create: Any => js.Promise[TContext]): Create[TContext] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[Create[TContext]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Create[?], TContext /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any */] (val x: Self & Create[TContext]) extends AnyVal {
      
      inline def setCreate(value: Any => js.Promise[TContext]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
}
