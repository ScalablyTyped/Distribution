package typings.dadataApi

import typings.dadataApi.mod.DaDataApi.BankStatus
import typings.dadataApi.mod.DaDataApi.BankType
import typings.dadataApi.mod.DaDataApi.Nullable
import typings.dadataApi.mod.DaDataApi.PartyStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actualitydate extends StObject {
    
    var actuality_date: Double
    
    var code: Nullable[String]
    
    var liquidation_date: Nullable[Double]
    
    var registration_date: Double
    
    var status: PartyStatus
  }
  object Actualitydate {
    
    inline def apply(actuality_date: Double, registration_date: Double, status: PartyStatus): Actualitydate = {
      val __obj = js.Dynamic.literal(actuality_date = actuality_date.asInstanceOf[js.Any], registration_date = registration_date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], code = null, liquidation_date = null)
      __obj.asInstanceOf[Actualitydate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Actualitydate] (val x: Self) extends AnyVal {
      
      inline def setActuality_date(value: Double): Self = StObject.set(x, "actuality_date", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Nullable[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeNull: Self = StObject.set(x, "code", null)
      
      inline def setLiquidation_date(value: Nullable[Double]): Self = StObject.set(x, "liquidation_date", value.asInstanceOf[js.Any])
      
      inline def setLiquidation_dateNull: Self = StObject.set(x, "liquidation_date", null)
      
      inline def setRegistration_date(value: Double): Self = StObject.set(x, "registration_date", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PartyStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var full: String
    
    var short: String
    
    var `type`: String
  }
  object Code {
    
    inline def apply(code: String, full: String, short: String, `type`: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Debt extends StObject {
    
    var debt: Nullable[String]
    
    var expense: Nullable[String]
    
    var income: Nullable[String]
    
    var penalty: Nullable[String]
    
    var tax_system: Nullable[String]
    
    var year: Nullable[String]
  }
  object Debt {
    
    inline def apply(): Debt = {
      val __obj = js.Dynamic.literal(debt = null, expense = null, income = null, penalty = null, tax_system = null, year = null)
      __obj.asInstanceOf[Debt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Debt] (val x: Self) extends AnyVal {
      
      inline def setDebt(value: Nullable[String]): Self = StObject.set(x, "debt", value.asInstanceOf[js.Any])
      
      inline def setDebtNull: Self = StObject.set(x, "debt", null)
      
      inline def setExpense(value: Nullable[String]): Self = StObject.set(x, "expense", value.asInstanceOf[js.Any])
      
      inline def setExpenseNull: Self = StObject.set(x, "expense", null)
      
      inline def setIncome(value: Nullable[String]): Self = StObject.set(x, "income", value.asInstanceOf[js.Any])
      
      inline def setIncomeNull: Self = StObject.set(x, "income", null)
      
      inline def setPenalty(value: Nullable[String]): Self = StObject.set(x, "penalty", value.asInstanceOf[js.Any])
      
      inline def setPenaltyNull: Self = StObject.set(x, "penalty", null)
      
      inline def setTax_system(value: Nullable[String]): Self = StObject.set(x, "tax_system", value.asInstanceOf[js.Any])
      
      inline def setTax_systemNull: Self = StObject.set(x, "tax_system", null)
      
      inline def setYear(value: Nullable[String]): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearNull: Self = StObject.set(x, "year", null)
    }
  }
  
  trait Disqualified extends StObject {
    
    var disqualified: Nullable[String]
    
    var name: String
    
    var post: String
  }
  object Disqualified {
    
    inline def apply(name: String, post: String): Disqualified = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], disqualified = null)
      __obj.asInstanceOf[Disqualified]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disqualified] (val x: Self) extends AnyVal {
      
      inline def setDisqualified(value: Nullable[String]): Self = StObject.set(x, "disqualified", value.asInstanceOf[js.Any])
      
      inline def setDisqualifiedNull: Self = StObject.set(x, "disqualified", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    }
  }
  
  trait Full extends StObject {
    
    var full: String
    
    var full_with_opf: String
    
    var latin: Nullable[String]
    
    var short: String
    
    var short_with_opf: String
  }
  object Full {
    
    inline def apply(full: String, full_with_opf: String, short: String, short_with_opf: String): Full = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], full_with_opf = full_with_opf.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], short_with_opf = short_with_opf.asInstanceOf[js.Any], latin = null)
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFull_with_opf(value: String): Self = StObject.set(x, "full_with_opf", value.asInstanceOf[js.Any])
      
      inline def setLatin(value: Nullable[String]): Self = StObject.set(x, "latin", value.asInstanceOf[js.Any])
      
      inline def setLatinNull: Self = StObject.set(x, "latin", null)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShort_with_opf(value: String): Self = StObject.set(x, "short_with_opf", value.asInstanceOf[js.Any])
    }
  }
  
  trait Liquidationdate extends StObject {
    
    var actuality_date: Double
    
    var liquidation_date: Nullable[Double]
    
    var registration_date: Double
    
    var status: BankStatus
  }
  object Liquidationdate {
    
    inline def apply(actuality_date: Double, registration_date: Double, status: BankStatus): Liquidationdate = {
      val __obj = js.Dynamic.literal(actuality_date = actuality_date.asInstanceOf[js.Any], registration_date = registration_date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], liquidation_date = null)
      __obj.asInstanceOf[Liquidationdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Liquidationdate] (val x: Self) extends AnyVal {
      
      inline def setActuality_date(value: Double): Self = StObject.set(x, "actuality_date", value.asInstanceOf[js.Any])
      
      inline def setLiquidation_date(value: Nullable[Double]): Self = StObject.set(x, "liquidation_date", value.asInstanceOf[js.Any])
      
      inline def setLiquidation_dateNull: Self = StObject.set(x, "liquidation_date", null)
      
      inline def setRegistration_date(value: Double): Self = StObject.set(x, "registration_date", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: BankStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payment extends StObject {
    
    var full: Null
    
    var payment: String
    
    var short: String
  }
  object Payment {
    
    inline def apply(full: Null, payment: String, short: String): Payment = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
      
      inline def setFull(value: Null): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setPayment(value: String): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  trait Short extends StObject {
    
    var full: Null
    
    var short: Null
    
    var `type`: BankType
  }
  object Short {
    
    inline def apply(full: Null, short: Null, `type`: BankType): Short = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Short]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Short] (val x: Self) extends AnyVal {
      
      inline def setFull(value: Null): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Null): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setType(value: BankType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
