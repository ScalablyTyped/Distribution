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
    
    @scala.inline
    def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[typings.std.Date] = js.undefined
    
    var start: js.UndefOr[typings.std.Date] = js.undefined
  }
  object End {
    
    @scala.inline
    def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: typings.std.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: typings.std.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait EndDate extends StObject {
    
    var endDate: js.UndefOr[typings.std.Date] = js.undefined
    
    var startDate: typings.std.Date
  }
  object EndDate {
    
    @scala.inline
    def apply(startDate: typings.std.Date): EndDate = {
      val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndDate]
    }
    
    @scala.inline
    implicit class EndDateMutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndDate(value: typings.std.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setStartDate(value: typings.std.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
}
