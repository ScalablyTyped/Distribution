package typings.bulmaCalendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Date extends StObject {
    
    /**
      * Date icon
      */
    var date: js.UndefOr[String] = js.undefined
    
    /**
      * Next button icon
      */
    var next: js.UndefOr[String] = js.undefined
    
    /**
      * Previous button icon
      */
    var previous: js.UndefOr[String] = js.undefined
    
    /**
      * Time icon
      */
    var time: js.UndefOr[String] = js.undefined
  }
  object Date {
    
    inline def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[js.Date] = js.undefined
    
    var start: js.UndefOr[js.Date] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait EndDate extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var startDate: js.Date
  }
  object EndDate {
    
    inline def apply(startDate: js.Date): EndDate = {
      val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
}
